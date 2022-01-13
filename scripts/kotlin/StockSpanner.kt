

/*
Design an algorithm that collects daily price quotes for some stock and returns the span of that stock's price for the current day.

The span of the stock's price today is defined as the maximum number of consecutive days (starting from today and going backward) for which the stock price was less than or equal to today's price.

    For example, if the price of a stock over the next 7 days were [100,80,60,70,60,75,85], then the stock spans would be [1,1,1,2,1,4,6].

Implement the StockSpanner class:

    StockSpanner() Initializes the object of the class.
    int next(int price) Returns the span of the stock's price given that today's price is price.

*/
class StockSpanner() {

  private var stack = LinkedList<Pair<Int, Int>>()
  fun next(price: Int): Int {
    var span = 1
    while (stack.isNotEmpty() && stack.peek().first <= price) span += stack.pop().second
    stack.push(Pair(price, span))
    return span
  }
}
