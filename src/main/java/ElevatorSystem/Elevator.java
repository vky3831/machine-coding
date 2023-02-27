package ElevatorSystem;

import java.util.PriorityQueue;

// https://tedweishiwang.github.io/journal/object-oriented-design-elevator.html
public class Elevator {
    int currentFloor;
    Direction direction;
    // minheap
    PriorityQueue<Request> upRequestQ;
    // maxheap
    PriorityQueue<Request> downRequestQ;

    Elevator(int currentFloor){
        this.currentFloor = currentFloor;
        this.direction = Direction.IDLE;
        upRequestQ = new PriorityQueue<>((a, b) -> a.desiredFloor - b.desiredFloor );
        downRequestQ = new PriorityQueue<>((a, b) ->  b.desiredFloor - a.desiredFloor );
    }

    void sendUpRequest(Request uprequest){
        // If the request is sent from out side of the elevator,
        // we need to stop at the current floor of the requester
        // to pick him up, and then go the the desired floor.
        if(uprequest.location == Location.OUTSIDE){
            // Go pick up the requester who is outside of the elevator
            upRequestQ.add(new Request(uprequest.currentFloor, uprequest.currentFloor, Direction.UP, Location.OUTSIDE));
            System.out.println("Append up request to floor " + uprequest.currentFloor);
        }

        upRequestQ.add(uprequest);
        System.out.println("Append up request to floor " + uprequest.desiredFloor);
    }

    // If the request is sent from out side of the elevator,
    // we need to stop at the current floor of the requester
    // to pick him up, and then go the the desired floor.
    void sendDownRequest(Request downrequest){
        // Go pick up the requester who is outside of the elevator
        if(downrequest.location == Location.OUTSIDE){
            downRequestQ.add(new Request(downrequest.currentFloor, downrequest.currentFloor, Direction.DOWN, Location.OUTSIDE));
            System.out.println("Append down request to floor " + downrequest.currentFloor);
        }

        downRequestQ.add(downrequest);
        System.out.println("Append down request to floor " + downrequest.desiredFloor);
    }

    void run(){
        if(!upRequestQ.isEmpty() || !downRequestQ.isEmpty()){
            processRequests();
        }
        this.direction = Direction.IDLE;
        System.out.println("All request processed");
    }

    private void processRequests() {
        if(!upRequestQ.isEmpty() || direction == Direction.IDLE){
            processUpRequests();
            processDownRequests();
        }else{
            processDownRequests();
            processUpRequests();
        }
    }

    private void processUpRequests() {
        while(!upRequestQ.isEmpty()){
            Request req = upRequestQ.poll();
            System.out.println("Elevator Stops at " + req.desiredFloor);
        }
        if(!downRequestQ.isEmpty()){
            direction = Direction.DOWN;
        }else{
            direction = Direction.IDLE;
        }
    }

    private void processDownRequests() {
        while(!downRequestQ.isEmpty()){
            Request req = downRequestQ.poll();
            System.out.println("Elevator Stops at " + req.desiredFloor);
        }
        if(!upRequestQ.isEmpty()){
            direction = Direction.UP;
        }else{
            direction = Direction.IDLE;
        }
    }
}
