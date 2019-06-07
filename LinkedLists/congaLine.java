public class congaLine {
	
	private congaLineNode first;
	
	public class congaLineNode {
		private String name;
		private congaLineNode next;

		public congaLineNode(String name, congaLineNode next) {
			this.name = name;
			this.next = next;
		}
	}
}
