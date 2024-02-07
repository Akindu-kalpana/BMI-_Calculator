import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to BMI Calculator")

    // Input weight in kilograms
    print("Enter your weight in kilograms: ")
    val weight = scanner.nextDouble()

    // Input height in meters
    print("Enter your height in meters: ")
    val height = scanner.nextDouble()

    // Calculate BMI
    val bmi = calculateBMI(weight, height)

    // Display BMI and interpretation
    println("Your BMI is: $bmi")
    println("Interpretation:")
    println(getBMICategory(bmi))
}

fun calculateBMI(weight: Double, height: Double): Double {

    return weight / (height * height)
}

fun getBMICategory(bmi: Double): String {
    return when {
        bmi < 18.5 -> "Underweight"
        bmi >= 18.5 && bmi < 25 -> "Normal weight"
        bmi >= 25 && bmi < 30 -> "Overweight"
        else -> "Obese"
    }
}
