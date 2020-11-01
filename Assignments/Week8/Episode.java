package Assignments.Week8;

public class Episode {
   private String title;
   private int seasonNumber;
   private int episodeNumber;

    public Episode(String t, int sN, int eN) {
        this.title = t;
        this.seasonNumber = sN;
        this.episodeNumber = eN;
    }

    public Episode(String t) {
        this.title = t;
        this.seasonNumber = 1;
        this.episodeNumber = 1;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public String getTitle (String t) {
        return title;
    }

    public boolean equals(Episode e) { 
        boolean equalTitle;
        boolean equalEpisode;
        boolean equalSeason;
        if (this.title.equals(e.getTitle(title))) {
            equalTitle = true;
        } else {
            equalTitle = false;
        }

        if (this.episodeNumber == e.episodeNumber) {
            equalEpisode = true;
        } else {
            equalEpisode = false;
        }

        if (this.seasonNumber == e.seasonNumber) {
            equalSeason = true;
        } else {
            equalSeason = false;
        }

        return (equalTitle && equalEpisode && equalSeason);
    }


    public boolean comesBefore (Episode e) {
        boolean isEqual = false;

        if(this.title.equals(e.getTitle(title))) {
            if (this.seasonNumber < e.seasonNumber) {
                isEqual = true;
            } else if(this.episodeNumber < e.episodeNumber) {
                isEqual = true;
            }
        }
        return isEqual;
    }
}
