class Main{
    companion object : ICallbackController {
        @JvmStatic
        fun main(args: Array<String>){
            var loop = 0
            val mutList = mutableListOf<Int>()
            do {
                println("Masukan nilai index ke $loop : ")
                var input = readLine()!!.toInt()
                mutList.add(loop,input)
                ++loop
            }while (loop < 4)

            println(mutList)

            var controller = Controller()
            controller.hitungDeterminan(mutList,this)


        }

        override fun cetakHasil(hasil: Int) {
            println("Hasil determinannya adalah = $hasil")
        }
    }

}