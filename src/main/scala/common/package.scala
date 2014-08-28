package object common extends Types
{
	case class BasicException(msg:String) extends Exception
		{
			println(msg)
		}
}

