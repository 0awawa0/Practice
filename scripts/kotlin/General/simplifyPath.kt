
/*
Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path.

In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any other format of periods such as '...' are treated as file/directory names.

The canonical path should have the following format:

    + The path starts with a single slash '/'.
    + Any two directories are separated by a single slash '/'.
    + The path does not end with a trailing '/'.
    + The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')

Return the simplified canonical path.
*/

fun simplifyPath(path: String): String {
  var prevChar = ' '
  val tokens = simplifySlashes(path).split("/").filter { it.isNotBlank() }
  val pathQueue = LinkedList<String>()
  for (token in tokens) {
    if (token.isBlank()) continue
    when (token) {
      "." -> {}
      ".." -> if (pathQueue.isNotEmpty()) pathQueue.removeLast()
      else -> pathQueue.add(token)
    }
  }
        
  val result = StringBuilder()
  for (token in pathQueue) result.append("/$token")
  if (result.isEmpty()) return "/"
  else return result.toString()
}
    
private fun simplifySlashes(path: String): String {
  var prevChar = ' '
  val result = StringBuilder()
  for (char in path) {
    if (char == '/' && prevChar == '/') continue
    prevChar = char
    result.append(char)
  }
  return result.toString()
}
