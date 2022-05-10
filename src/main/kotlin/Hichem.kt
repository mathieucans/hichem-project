class Hichem {
    private var hasTriedTdd: Boolean = false

    fun likeTdd(): Boolean {
        return hasTriedTdd
    }

    fun tryTdd(): Hichem {
        this.hasTriedTdd = true
        return this
    }

    fun beAgree(aggree: Boolean): Hichem {
        return this
    }

    fun isCool(): Boolean {
        return true
    }

    fun shareMusic(music: String): Hichem {
        return this
    }

    fun useMouseToDevelop(): Boolean {
        return true
    }

}
