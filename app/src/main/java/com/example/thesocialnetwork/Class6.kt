package com.example.thesocialnetwork

enum class Brand{
    Samsung,
    Huawei,
    Apple,
    Nokia,
    Unknown
}

enum class Color{
    Black,
    White,
    Gray,
    AliceBlue
}

//Esta es una clase en kotlin, para poder heredar a otras clases debo comenzarla como open class

open class ElectronicDevice(
    var brand: Brand = Brand.Unknown,
    var height: Float = 0F,
    var width: Float = 0F,
    var model: String = "",
    var color: Color = Color.AliceBlue
){
    override fun toString(): String {
        return "Brand: $brand, Height: $height, Width: $width, Model: $model, Color: $color,"
    }

    fun pepito(){
        println("Haz llamado a pepito:  $brand")
    }
}

open class MobileDevice(
    var numberOfCameras: Int,
    var battery: Int
): ElectronicDevice(){
    override fun toString(): String {
        return super.toString() + " Number of cameras: $numberOfCameras, Battery: $battery "
    }

    fun juanita(){
        println("Haz llamado a juanita: $color")
    }
}




fun main(){
    val phone = MobileDevice(2,98)

    phone.brand = Brand.Samsung

    println(phone.toString())

    phone.pepito()
    phone.juanita()
}