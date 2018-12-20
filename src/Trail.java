public class Trail {

    private int[] markers;
    public Trail(int[] markers) {
        this.markers = markers;
    }

    public boolean isLevelTrailSegemnt(int start, int end) {
        int max = markers[0], min = markers[0];

        for (int i = start; i <= end; i ++) {
            max = Math.max(max, markers[i]); min = Math.min(min, markers[i]);
        }
        if (max - min <= 10) {
            return true;
        } return false;
    }

    public boolean isDifficult() {
        int jags = 0;
        for (int i = 0; i < markers.length - 1; i ++) {
            if (Math.abs(Math.abs(markers[i]) - Math.abs(markers[i + 1])) >= 30) {
                jags ++
            }
        }
        if (jags >= 3) {
            return true;
        } return false;
    }
}
