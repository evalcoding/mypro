package com.javaabc.designpatterns;

interface State{
	public void doAction(Context context);
}
class StartState implements State{
	public void doAction(Context context) {
		System.out.println("Player in an start state!");
		context.setState(this);
	}
	public String toString() {
		return "Start state";
	}
}
class StopState implements State{
	public void doAction(Context context) {
		System.out.println("Player is an stop state!");
		context.setState(this);
	}
}
class Context{
	private State state;
	public Context() {}
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
}
public class StatePatternDemo {
public static void main(String[] args) {
	Context context=new Context();
	StartState startState=new StartState();
	startState.doAction(context);
	System.out.println(context.getState().toString());
}
}
