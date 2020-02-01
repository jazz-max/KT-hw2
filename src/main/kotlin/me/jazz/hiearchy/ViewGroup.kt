package me.jazz.hiearchy

class ViewGroup() : View() {

    private var view: View? = null

    fun addView(v: View) {
        view = v
    }
}