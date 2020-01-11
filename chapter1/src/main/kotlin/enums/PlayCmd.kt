package enums

/**
 * @Classname PlayCmd
 * @Description TODO
 * @Date 2020-01-11 10:28
 * @Created by chenqiao
 */


/**
 * 子类可数
 */
sealed class PlayCmd {

    class Play(val url: String): PlayCmd()

    class Seek(val pos: Long): PlayCmd()

    class Pause(): PlayCmd()

    class Resume(): PlayCmd()

}