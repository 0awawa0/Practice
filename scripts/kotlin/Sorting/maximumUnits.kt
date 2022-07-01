
/*
You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:

    numberOfBoxesi is the number of boxes of type i.
    numberOfUnitsPerBoxi is the number of units in each box of the type i.

You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.

Return the maximum total number of units that can be put on the truck.
*/

fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {
    boxTypes.sortByDescending { it[1] }
    var spaceLeft = truckSize
    var units = 0
    for (type in boxTypes) {
        if (type[0] >= spaceLeft) {
            units += type[1] * spaceLeft
            break
        } else {
            units += type[1] * type[0]
            spaceLeft -= type[0]
        }
    }
    return units
}