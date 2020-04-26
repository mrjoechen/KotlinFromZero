package com.chenqiao.kotlin;

import sun.security.provider.MD5;

import java.security.MessageDigest;

public class MD5Util {

        private static String KEY = "98sky98sky6ad6ad";

        private static final char hexDigits[] =
                {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        private static String toHexString(byte[] bytes) {
            if (bytes == null) return "";
            StringBuilder hex = new StringBuilder(bytes.length * 2);
            for (byte b : bytes) {
                hex.append(hexDigits[(b >> 4) & 0x0F]);
                hex.append(hexDigits[b & 0x0F]);
            }
            return hex.toString();
        }

        /**
         * MD5加密
         *
         * @param s 明文
         * @return MD5密文
         */
        public final static String MD5(String s) {
            try {
                byte[] btInput = s.getBytes();
                MessageDigest mdInst = MessageDigest.getInstance("MD5");
                mdInst.update(btInput);
                byte[] md = mdInst.digest();
                return toHexString(md);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }


        /**
         * 0xEFAB  to  0xFEBA
         *
         * @param a
         * @return
         */
        public static int change(int a) {
            int code = a;

            byte[] src = new byte[]{
                    (byte) ((code & 0xFF000000) >> 24), (byte) ((code & 0x00FF0000) >> 16), (byte) ((code & 0x0000FF00) >> 8),
                    (byte) ((code & 0xFF))
            };


            byte[] codeByte = change(src);


            int decode = ((codeByte[0] << 24) & 0xFF000000)
                    | ((codeByte[1] << 16) & 0x00FF0000)
                    | ((codeByte[2] << 8) & 0xFF00) | ((codeByte[3] & 0xFF));
            return decode;

        }

        private static byte[] change(byte[] in) {
            int length = in.length;
            for (int i = 2; i < length; i++) {
                byte temp = in[i];
                in[i] = (byte) ((~((byte) (((temp >> 4) & 0x0F) | (temp << 4 & 0xF0)))) & 0xFF);

            }

            return in;
        }

}
