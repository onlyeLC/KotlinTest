package com.amorcloud.kotlintest

 open class Person (val name:String,val father:String,val mother:String){
  public fun teach() {
   println("$father and $mother teach $name")
  }
}