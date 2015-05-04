
class MoveStarsGateway {
    
    def getTheCoolOnes : Seq[String] = {
        // Some elaborate api call to some weird service somewhere
        Seq[String]("One", "Two", "Three", "Four")
    } 

}

// Main app flow
object main extends App {
    
    val gatewayToTheStars = new MoveStarsGateway()

    println(s"${gatewayToTheStars.getTheCoolOnes}")

}