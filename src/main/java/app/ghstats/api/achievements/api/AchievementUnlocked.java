package app.ghstats.api.achievements.api;

public record AchievementUnlocked(Achievement achievement, GitCommit commit) {
}
