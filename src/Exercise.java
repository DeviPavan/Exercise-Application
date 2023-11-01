public class Exercise {
    private final int durationMinutes;
    private final int difficultyLevel;
    private final String Name;
    private final String description;
        public Exercise(String Name, int difficultyLevel, int durationMinutes, String description)

        {
            this.Name = Name;
            this.difficultyLevel = difficultyLevel;
            this.durationMinutes = durationMinutes;
            this.description = description;
        }
    public String getName() {
        return Name;
    }
    public int getDifficultyLevel(){
        return difficultyLevel;
    }
    public int getDurationMinutes() {
        return durationMinutes;
    }
    public String getDescription() {
        return description;
    }

}
