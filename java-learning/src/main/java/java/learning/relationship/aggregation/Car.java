package java.learning.relationship.aggregation;

// with aggregation a car performs its functions through Engine but an engine is not an internal part of car.
// outside world has reference to engine and tinker with it regardless of whether it's in car.
public final class Car {
	private Engine engine;
	
	void setEngine(Engine engine){
		this.engine=engine;
	}
	
	void move(){
		if(engine!=null){
			engine.work();
		}
	}
}


