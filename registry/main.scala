import scala.collection.mutable._

// Object provide singltion access to underling Map
object Registry {
    var _store = Map[Int, String]()
    def default = _store

    // Could load registry files in
    def loadFromFile (file : String) = {}

    // Could save for persistance
    def saveRegistryToFile (file : String) = {}
}

// Main app flow
object main extends App {
    
    // Can get a referance to the registry object
    val registry = Registry.default;
    
    // Add a String value with 10 as its key
    println("Adding \"Betty White is awesome\" with key 10")
    registry += (10 -> "Betty White is awesome")

    println(s"Try to get 10 -> ${registry.get(10).getOrElse("No Value Found")}")
    println(s"Try to get 12 -> ${registry.get(12).getOrElse("No Value Found")}")

    println("Accessing directly of the Registry object")
    println(s"Try to get 10 -> ${Registry.default.get(10).getOrElse("No Value Found")}")

    println("Removing Betty White")
    registry -= 10
    println(s"Try to get 10 -> ${registry.get(10).getOrElse("No Value Found")}")

}