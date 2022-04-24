
/*
TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk. Design a class to encode a URL and decode a tiny URL.

There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.

Implement the Codec class:

    Codec() Initializes the object of the system.
    String encode(String longUrl) Returns a tiny URL for the given longUrl.
    String decode(String shortUrl) Returns the original long URL for the given shortUrl. It is guaranteed that the given shortUrl was encoded by the same object.

*/

class Codec() {
    
    private var number = 0L
    private val map = HashMap<String, String>()
    
    // Encodes a URL to a shortened URL.
    fun encode(longUrl: String): String {
        val url = "http://tinyurl.com/$number"
        number++
        map[url] = longUrl
        return url
    }

    // Decodes a shortened URL to its original URL.
    fun decode(shortUrl: String): String { return map[shortUrl]!! }
}