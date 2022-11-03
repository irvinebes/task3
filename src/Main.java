public class Main {
    public static void main(String[] args) {
        // 6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println(totalWeight);
        var differenceWeight = secondBoxer - firstBoxer;
        System.out.println(differenceWeight);
        // 7

        System.out.println("Второй способ: ");
        var secondDifferenceWeight = secondBoxer % firstBoxer;
        System.out.println(secondDifferenceWeight);

        // 8

        System.out.println("1.");
        var totalHours = 640;
        var oneDayHour = 8;
        var totalWorkers = totalHours / oneDayHour;
        System.out.println("Всего работников: " + (totalWorkers));
        System.out.println("2.");
        totalWorkers = totalWorkers + 94;
        totalHours = oneDayHour * totalWorkers;
        System.out.println("Если в компании работает " + (totalWorkers) + " человек, то всего " + (totalHours) + " часов работы может быть поделено между сотрудниками.");



    }
}