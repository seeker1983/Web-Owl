package game.owl.model.comic

class ComicDialog

case class SpeechDialog(val text:String) extends ComicDialog
case class ThoughtDialog(val text:String) extends ComicDialog

class ComicData(val dialogs:List[ComicDialog])