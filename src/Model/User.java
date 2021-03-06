package Model;

public class User {
    private Integer id;
    private String nickName;
    private Integer avatar;
    private String email;
    private String password;
    private Integer score;
    private Integer numWinLiterature;
    private Integer numLoseLiterature;
    private Integer numWinMath;
    private Integer numLoseMath;
    private Integer numWinArt;
    private Integer numLoseArt;
    private Integer numWinHistory;
    private Integer numLoseHistory;
    private Integer numWinMusic;
    private Integer numLoseMusic;
    private Integer numWinGeography;
    private Integer numLoseGeography;
    private Integer numWinEnglish;
    private Integer numLoseEnglish;
    private Integer numWinCommonsense;
    private Integer numLoseCommonsense;
    private String deviceToken;

    public User(Integer id, String nickName, Integer avatar, String email, String password, String deviceToken){
        this.id = id;
        this.nickName = nickName;
        this.avatar = avatar;
        this.email = email;
        this.password = password;
        this.score = 0;
        this.numWinLiterature = 0;
        this.numLoseLiterature = 0;
        this.numWinMath = 0;
        this.numLoseMath = 0;
        this.numWinArt = 0;
        this.numLoseArt = 0;
        this.numWinHistory = 0;
        this.numLoseHistory = 0;
        this.numWinMusic = 0;
        this.numLoseMusic = 0;
        this.numWinGeography = 0;
        this.numLoseGeography = 0;
        this.numWinEnglish = 0;
        this.numLoseEnglish = 0;
        this.numWinCommonsense = 0;
        this.numLoseCommonsense = 0;
        this.deviceToken = deviceToken;
    }
    public User(Integer id, String nickName, Integer avatar, String email, String password, Integer score, Integer numWinLiterature, Integer numLoseLiterature, Integer numWinMath, Integer numLoseMath, Integer numWinArt, Integer numLoseArt, Integer numWinHistory, Integer numLoseHistory, Integer numWinMusic, Integer numLoseMusic, Integer numWinGeography, Integer numLoseGeography, Integer numWinEnglish, Integer numLoseEnglish, Integer numWinCommonsense, Integer numLoseCommonsense, String deviceToken) {
        this.id = id;
        this.nickName = nickName;
        this.avatar = avatar;
        this.email = email;
        this.password = password;
        this.score = score;
        this.numWinLiterature = numWinLiterature;
        this.numLoseLiterature = numLoseLiterature;
        this.numWinMath = numWinMath;
        this.numLoseMath = numLoseMath;
        this.numWinArt = numWinArt;
        this.numLoseArt = numLoseArt;
        this.numWinHistory = numWinHistory;
        this.numLoseHistory = numLoseHistory;
        this.numWinMusic = numWinMusic;
        this.numLoseMusic = numLoseMusic;
        this.numWinGeography = numWinGeography;
        this.numLoseGeography = numLoseGeography;
        this.numWinEnglish = numWinEnglish;
        this.numLoseEnglish = numLoseEnglish;
        this.numWinCommonsense = numWinCommonsense;
        this.numLoseCommonsense = numLoseCommonsense;
        this.deviceToken = deviceToken;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getAvatar() {
        return avatar;
    }

    public void setAvatar(Integer avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getNumWinLiterature() {
        return numWinLiterature;
    }

    public void setNumWinLiterature(Integer numWinLiterature) {
        this.numWinLiterature = numWinLiterature;
    }

    public Integer getNumLoseLiterature() {
        return numLoseLiterature;
    }

    public void setNumLoseLiterature(Integer numLoseLiterature) {
        this.numLoseLiterature = numLoseLiterature;
    }

    public Integer getNumWinMath() {
        return numWinMath;
    }

    public void setNumWinMath(Integer numWinMath) {
        this.numWinMath = numWinMath;
    }

    public Integer getNumLoseMath() {
        return numLoseMath;
    }

    public void setNumLoseMath(Integer numLoseMath) {
        this.numLoseMath = numLoseMath;
    }

    public Integer getNumWinArt() {
        return numWinArt;
    }

    public void setNumWinArt(Integer numWinArt) {
        this.numWinArt = numWinArt;
    }

    public Integer getNumLoseArt() {
        return numLoseArt;
    }

    public void setNumLoseArt(Integer numLoseArt) {
        this.numLoseArt = numLoseArt;
    }

    public Integer getNumWinHistory() {
        return numWinHistory;
    }

    public void setNumWinHistory(Integer numWinHistory) {
        this.numWinHistory = numWinHistory;
    }

    public Integer getNumLoseHistory() {
        return numLoseHistory;
    }

    public void setNumLoseHistory(Integer numLoseHistory) {
        this.numLoseHistory = numLoseHistory;
    }

    public Integer getNumWinMusic() {
        return numWinMusic;
    }

    public void setNumWinMusic(Integer numWinMusic) {
        this.numWinMusic = numWinMusic;
    }

    public Integer getNumLoseMusic() {
        return numLoseMusic;
    }

    public void setNumLoseMusic(Integer numLoseMusic) {
        this.numLoseMusic = numLoseMusic;
    }

    public Integer getNumWinGeography() {
        return numWinGeography;
    }

    public void setNumWinGeography(Integer numWinGeography) {
        this.numWinGeography = numWinGeography;
    }

    public Integer getNumLoseGeography() {
        return numLoseGeography;
    }

    public void setNumLoseGeography(Integer numLoseGeography) {
        this.numLoseGeography = numLoseGeography;
    }

    public Integer getNumWinEnglish() {
        return numWinEnglish;
    }

    public void setNumWinEnglish(Integer numWinEnglish) {
        this.numWinEnglish = numWinEnglish;
    }

    public Integer getNumLoseEnglish() {
        return numLoseEnglish;
    }

    public void setNumLoseEnglish(Integer numLoseEnglish) {
        this.numLoseEnglish = numLoseEnglish;
    }

    public Integer getNumWinCommonsense() {
        return numWinCommonsense;
    }

    public void setNumWinCommonsense(Integer numWinCommonsense) {
        this.numWinCommonsense = numWinCommonsense;
    }

    public Integer getNumLoseCommonsense() {
        return numLoseCommonsense;
    }

    public void setNumLoseCommonsense(Integer numLoseCommonsense) {
        this.numLoseCommonsense = numLoseCommonsense;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }
}
