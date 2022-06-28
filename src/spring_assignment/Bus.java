package spring_assignment;

public class Bus {

    private static Long id; // 버스 고유 번호
    private int max_passenger; // 최대 승객 수
    private int now_passenger; // 현재 승객 수
    private int fee; // 요금
    private int gas_volume; // 주유량
    private int now_speed; // 현재 속도
    private BusStatus busStatus; // 상태 [ 운행, 차고지 ]

    public Bus() {
        crateBus();
    }

    private Bus(Long id, BusStatus busStatus) {
        this.id = id;
        this.busStatus = busStatus;
    }

    // 버스 생성
    private Bus crateBus() {
        id++;
        return new Bus(id, BusStatus.운행); // 버스 객체 생성시 최초 상태 ‘운행’
    }

    // 버스 상태 변경
    public void changeStatus(Bus bus) {
        // 주유량이 떨어지거나, 운행을 종료할 때 ‘차고지행’ 상태로 변경 합니다.
        if (bus.getGas_volume() == 0) {
            bus.setBusStatus(BusStatus.차고지행);
        }
    }

    // 주유 확인
    public void checkGas(Bus bus) {
        // 10미만일 경우 ‘주유가 필요하다’는 메시지를 출력해 주세요
        if (bus.getGas_volume() < 10) {
            System.out.println("주유가 필요합니다");
        } else {
            System.out.println("주유량 양호");
        }
    }


    // 승객 탑승
    public void passengerUpdate(Bus bus, int passengerNum) {

        BusStatus bs = bus.getBusStatus();
        String nowBs = bs.name();

        // 탑승시 현재 승객수가 증가되어야 합니다.
        int updatePassengerNum = bus.getNow_passenger() + passengerNum;

        try {
            // 승객 탑승은 ‘최대 승객수’ 이하까지 가능하며 ‘운행 중’인 상태의 버스만 가능합니다.
            if (nowBs == "운행" && updatePassengerNum <= bus.max_passenger) {
                bus.setNow_passenger(updatePassengerNum);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("탑승 불가 상태입니다");
        }
    }

    // 속도 변경
    public void changeSpeed(Bus bus, int receiveSpeed) {
        // 주유 상태를 체크하고 주유량이 10 이상이어야 운행할 수 있습니다.
        if (bus.getGas_volume() >= 10) {
            // 변경할 속도를 입력 받아 현재 속도에 추가 하거나 뺄 수 있어야 합니다.
            bus.setNow_speed(bus.getNow_speed() + receiveSpeed);
        } else {
            System.out.println("주유량을 확인해 주세요.");
        }
    }


    public Bus(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMax_passenger() {
        return max_passenger;
    }

    public void setMax_passenger(int max_passenger) {
        this.max_passenger = max_passenger;
    }

    public int getNow_passenger() {
        return now_passenger;
    }

    public void setNow_passenger(int now_passenger) {
        this.now_passenger = now_passenger;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int tax) {
        this.fee = tax;
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

    public BusStatus getBusStatus() {
        return busStatus;
    }

    public void setBusStatus(BusStatus busStatus) {
        this.busStatus = busStatus;
    }
}
