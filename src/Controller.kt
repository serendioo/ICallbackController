class Controller(){
    fun hitungDeterminan(arrays : MutableList<Int>, iCallbackController: ICallbackController){
        var hasil = (arrays[0]*arrays[3])-(arrays[1]*arrays[2])
        iCallbackController.cetakHasil(hasil)
    }
}