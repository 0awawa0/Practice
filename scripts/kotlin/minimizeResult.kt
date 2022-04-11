
/*
You are given a 0-indexed string expression of the form "<num1>+<num2>" where <num1> and <num2> represent positive integers.

Add a pair of parentheses to expression such that after the addition of parentheses, expression is a valid mathematical expression and evaluates to the smallest possible value. The left parenthesis must be added to the left of '+' and the right parenthesis must be added to the right of '+'.

Return expression after adding a pair of parentheses such that expression evaluates to the smallest possible value. If there are multiple answers that yield the same result, return any of them.

The input has been generated such that the original value of expression, and the value of expression after adding any pair of parentheses that meets the requirements fits within a signed 32-bit integer.
*/

fun minimizeResult(expression: String): String {
    val chars = expression.toCharArray()
    val plusIndex = chars.indexOf('+')
    var minExpr = ""
    var minValue = Int.MAX_VALUE
    for (i in 0 until plusIndex) {
        var outerNum1 = if (i == 0) 1 else 0
        for (k in 0 until i) outerNum1 = outerNum1 * 10 + Character.getNumericValue(chars[k])

        var innerNum1 = 0
        for (k in i until plusIndex) innerNum1 = innerNum1 * 10 + Character.getNumericValue(chars[k])
            
        for (j in plusIndex + 2 .. chars.size) {
            var innerNum2 = 0
            for (k in plusIndex + 1 until j) innerNum2 = innerNum2 * 10 + Character.getNumericValue(chars[k])
                
            var outerNum2 = if (j == chars.size) 1 else 0
            for (k in j until chars.size) outerNum2 = outerNum2 * 10 + Character.getNumericValue(chars[k])
                
            val value = outerNum1 * (innerNum1 + innerNum2) * outerNum2
                
            if (value < minValue) {
                minValue = value
                val builder = StringBuilder()
                for (k in 0 until i) builder.append(chars[k])
                builder.append("(")
                    
                for (k in i until j) builder.append(chars[k])
                builder.append(")")
                    
                for (k in j until chars.size) builder.append(chars[k])
                minExpr = builder.toString()
            }
        }
    }
        
    return minExpr
}