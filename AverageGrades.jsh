public static int[] average_grades(int grades[][], int weights[]) {
        int numberOfStudents = grades.length;
        int numberOfComponents = grades[0].length;
        int[] weightedAverages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            int sum = 0;
            for (int j = 0; j < numberOfComponents; j++) {
                sum += grades[i][j] * weights[j];
            }
            weightedAverages[i] = sum / 100; // This will automatically round down to the nearest integer due to integer division
        }

        return weightedAverages;
    }