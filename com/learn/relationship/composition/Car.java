package com.learn.relationship.composition;

// Engine is completely encapsulated by car. There is no way for outside world to get referene of engine
public final class Car {
	private final Engine engine;

	public Car(EngineSpecs specs) {
		engine = new Engine(specs);
	}
	
	public void move(){
		engine.work();
	}
	
	private class Engine {

		private Engine(EngineSpecs specs) {

		}
		
		private void work(){
			
		}

	}
}


