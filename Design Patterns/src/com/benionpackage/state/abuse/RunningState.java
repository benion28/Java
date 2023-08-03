package com.benionpackage.state.abuse;

public class RunningState implements State {
    private StopWatch stopwatch;

    public RunningState(StopWatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentState(new StoppedState(stopwatch));
        System.out.println("Stopwatch Running");
    }
}
