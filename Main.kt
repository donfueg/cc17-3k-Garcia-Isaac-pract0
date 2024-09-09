fun main() {
    val pounds = 135.14
    val kilograms = pounds * 0.453592
    println("Weight in Pounds (lbs): $pounds")
    println("Weight converted to kilograms (kg): $kilograms")
    println("=================================================================================")

    val miles = 69
    val kilometers = miles * 1.609344
    println("Length in miles (mi): $miles")
    println("Length in kilometers (km): $kilometers")
    println("=================================================================================")

    val fahrenheit = 74
    val celsius = (fahrenheit - 32) * 5 / 9.0 // Use 9.0 for floating-point division
    println("Temperature in Fahrenheit: $fahrenheit")
    println("Temperature in Celsius: $celsius")
    println("=================================================================================")

    val students = arrayOf(21, 18, 17, 16, 15, 14, 13, 11, 10, 22)
    val averageAge = students.average()
    println("Average age of students: $averageAge")



    students.forEachIndexed { index, student ->
        println("Student age ${index + 1}: $student")

    }
    println("Average age of students: $averageAge")
    println("=================================================================================")

    // Character names

    val heroName = "Aric"
    val mentorName = "Eldrin"
    val villainName = "Morvath"
    val allyName = "Lyra"
    val mythicalCreatureName = "Gryphon"

    // Equipment and item names
    val swordName = "Celestial Blade"
    val shieldName = "Dragon's Guard"
    val magicWandName = "Starlight Wand"
    val enchantedAmuletName = "Amulet of Valor"

    // Ability names
    val specialAbility = "Flame Strike"
    val defensiveAbility = "Barrier of Light"

    // Constructing the story using string interpolation
    val fantasyStory = """
        In the mystical land of Eldoria, a brave warrior named $heroName embarked on a daring quest to vanquish the dark sorcerer $villainName. 
        With guidance from his wise mentor, $mentorName, $heroName was armed with the legendary $swordName and shielded by the mighty $shieldName.

        Along the perilous journey, $heroName was joined by a skilled ally named $allyName, who wielded the powerful $magicWandName 
        and wore the enchanted $enchantedAmuletName for protection. They faced numerous trials, using $specialAbility to defeat their enemies 
        and $defensiveAbility to safeguard themselves from harm.

        Their quest culminated in a climactic battle against $villainName, who had summoned a fearsome $mythicalCreatureName to aid him. 
        Through bravery and unity, $heroName and $allyName triumphed, restoring peace to Eldoria and becoming legends in their own right.
    """.trimIndent()

    println(fantasyStory)


}
