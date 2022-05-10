import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HichemTest {
    @Test
    fun `don't like tdd`(){
        assertThat(Hichem().likeTdd()).isFalse
    }

    @Test
    fun `but once he has tried it, he find it fun`(){
        assertThat(Hichem().tryTdd().likeTdd()).isTrue
    }

    @Test
    fun `it's cool to work with hichem because it's esay to be disagree with him`(){
        assertThat(Hichem().beAgree(true).isCool())
        assertThat(Hichem().beAgree(false).isCool())
    }

    @Test
    fun `it's cool to share music with hichem`(){
        assertThat(Hichem().shareMusic("hip hop don't stop").isCool())
    }

    @Test
    fun `but unfortunately hichem prefer 🐁 instead of ⌨`(){
        assertThat(Hichem().useMouseToDevelop())
    }
}
