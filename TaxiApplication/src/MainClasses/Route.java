package MainClasses;

public class Route {

    private String startPoint;
    private String endPoint;
    private double distance; // in km
    private int tripsPerDay;

    public Route (String startPoint, String endPoint, double distance, int tripsPerDay) {
        setStartPoint(startPoint);
        setEndPoint(endPoint);
        setDistance(distance);
        setTripsPerDay(tripsPerDay);
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getTripsPerDay() {
        return tripsPerDay;
    }

    public void setTripsPerDay(int tripsPerDay) {
        this.tripsPerDay = tripsPerDay;
    }
}
