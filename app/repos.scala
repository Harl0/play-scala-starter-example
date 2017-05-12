import play.api.libs.json.JsObject
import reactivemongo.api.commands.WriteResult
import reactivemongo.bson.BSONDocument

import scala.concurrent.{ExecutionContext, Future}
/**
  * Created by jason on 12/05/17.
  */
trait repos {
  def find()(implicit ec: ExecutionContext): Future[List[JsObject]]
  def select(selector: BSONDocument)(implicit ex: ExecutionContext): Future[Option[JsObject]]
  def update(selector: BSONDocument, update: BSONDocument)(implicit ec: ExecutionContext): Future[WriteResult]
  def remove(document: BSONDocument)(implicit ec: ExecutionContext): Future[WriteResult]
  def save(document: BSONDocument)(implicit ec: ExecutionContext): Future[WriteResult]

}
