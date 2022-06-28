package spring_assignment;

public class Taxi {

    private static Long id; // 택시 고유 번호
    private int gas_volume; // 주유량
    private int now_speed; // 현재 속도
    private String dest; // 목적지
    private int normalDistance; // 기본 거리
    private int distanceToDest; // 목적지까지 거리
    private int basicFee; // 기본 요금
    private int perDistanceFee; // 거리당 요금
    private TaxiStatus taxiStatus; // 상태 [ 운행중, 일반 ]

    public Taxi() {
        crateTaxi();
    }

    private Taxi(Long id, TaxiStatus taxiStatus) {
        this.id = id;
        this.taxiStatus = taxiStatus;
    }

    // 택시 생성
    private Taxi crateTaxi() {
        id++;
        return new Taxi(id, TaxiStatus.일반);
    }

    // 운행 시작
    public void driveStart(Taxi taxi) {
        if (taxi.getGas_volume() >= 10) {
            taxi.setTaxiStatus(TaxiStatus.운행중);
        }
    }

    // 승객 탑승
    public void passengerUpdate(Taxi taxi) {
        // 승객 탑승은 택시 상태가 ‘일반'일 때만 가능합니다.
        TaxiStatus ts = taxi.getTaxiStatus();
        String nowTs = ts.name();

        // ‘일반’ 상태의 택시가 승객을 태우면 ‘운행 중’ 상태로 변경해 주세요
        if (nowTs == "일반") {
            taxi.setTaxiStatus(TaxiStatus.운행중);
        }
    }

    // 속도 변경
    public void changeSpeed(Taxi taxi, int receiveSpeed) {
        // 변경할 속도를 입력 받아 현재 속도에 추가 하거나 뺄 수 있어야 합니다.
        taxi.setNow_speed(taxi.getNow_speed() + receiveSpeed);
    }

    // 요금 결제 & 거리당 요금 추가
    public void plusFee(int receiveDistance) {
        // 기본 거리보다 먼 곳은 추가 요금이 붙습니다.
        // 기본 거리와 추가 요금은 자유롭게 산정해 주세요
        int finalFee = 0;
        if (normalDistance < receiveDistance) {
            int plusDistance = receiveDistance - normalDistance;
            finalFee = basicFee + (perDistanceFee * plusDistance);
            System.out.println("최종 요금:" + finalFee + "원");
        } else {
            finalFee = basicFee;
            System.out.println("최종 요금:" + finalFee + "원");
        }
    }

    public static Long getId() {
        return id;
    }

    public static void setId(Long id) {
        Taxi.id = id;
    }

    public int getGas_volume() {
        return gas_volume;
    }

    public void setGas_volume(int gas_volume) {
        this.gas_volume = gas_volume;
    }

    public int getNow_speed() {
        return now_speed;
    }

    public void setNow_speed(int now_speed) {
        this.now_speed = now_speed;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public int getNormalDistance() {
        return normalDistance;
    }

    public void setNormalDistance(int normalDistance) {
        this.normalDistance = normalDistance;
    }

    public int getDistanceToDest() {
        return distanceToDest;
    }

    public void setDistanceToDest(int distanceToDest) {
        this.distanceToDest = distanceToDest;
    }

    public int getBasicFee() {
        return basicFee;
    }

    public void setBasicFee(int basicFee) {
        this.basicFee = basicFee;
    }

    public int getPerDistanceFee() {
        return perDistanceFee;
    }

    public void setPerDistanceFee(int perDistanceFee) {
        this.perDistanceFee = perDistanceFee;
    }

    public TaxiStatus getTaxiStatus() {
        return taxiStatus;
    }

    public void setTaxiStatus(TaxiStatus taxiStatus) {
        this.taxiStatus = taxiStatus;
    }
}
