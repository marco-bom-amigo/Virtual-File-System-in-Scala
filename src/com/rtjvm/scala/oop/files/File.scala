package com.rtjvm.scala.oop.files

import com.rtjvm.scala.oop.filesystem.FilesystemException

class File(override val parentPath: String, override val name: String, contents: String) extends DirEntry(parentPath = parentPath, name = name) {

  def asDirectory: Directory = throw new FilesystemException("A file cnnot be converted to be a directory!")

  def asFile: File = this

  def isDirectory: Boolean = false

  def isFile: Boolean = true

  def getType: String = "File"

}

object File {

  def empty(parentPath: String, name: String) : File =
    new File(parentPath = parentPath, name = name, contents = "")

}