public class DoorSt {
	public String State;

	DoorSt(String State) {
		this.State = State;
		String result = new String();
		switch(State)
		{
			case "OPEN":
				result = "Дверь открыта";
				break;
			case "CLOSED":
				result = "Дверь закрыта!";
				break;
			default:
				System.out.println("Что-то пошло не так!");
		}
		System.out.println(result);
	}
}