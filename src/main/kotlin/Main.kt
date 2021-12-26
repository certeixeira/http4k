import org.http4k.client.JavaHttpClient
import org.http4k.core.HttpHandler
import org.http4k.core.Method
import org.http4k.core.Request

fun main() {
    /* Code to send an HTTP requisition and show the result:
    We use the class Request to create an object, and on that object
    we pass the method and URL from that requisition */
    val requisition = Request(Method.GET, "https://xkcd.com/info.0.json")

    /* Create a val client that receives a native client from HTTP4K (JavaHttpClient) */
    val client: HttpHandler = JavaHttpClient()
    /* execute the  requisition with client(requisition), keeping all the data
    from the answer on the val requisitionResponse */
    val requisitionResponse = client(requisition)

    /* Show the result */
    println(requisitionResponse)
    println()
    println("Show the requisition status:")
    println(requisitionResponse.status)
}