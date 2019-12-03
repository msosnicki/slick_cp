package example

import slick.jdbc.PostgresProfile.api._

import scala.concurrent.duration._
import scala.concurrent.Await

object Hello extends App {
  val db = Database.forConfig("postgres")

  val fut = db.run(sqlu"""select 42""")
  Await.result(fut, 5.seconds)
}
