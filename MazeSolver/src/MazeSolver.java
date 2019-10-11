import java.util.LinkedList;

public class MazeSolver {

	static int[][] maze = {
			{2, 0, 1, 1},
			{1, 1, 1, 0},
			{0, 0, 0, 1}
	};
	//0 = wall
	//1 = path
	//2 = destination
	
	static LinkedList<Position> path = new LinkedList<Position>();
	
	public static void main(String[] args) {
		Position p = new Position(0, 3);
		path.push(p);
		
		
		while(true) {
			int y = path.peek().y;
			int x = path.peek().x;
			
			maze[y][x] = 0;
			
			//down
			if(maze[y+1][x] == 2) {
				System.out.println("Moved down. You won!");
				return;
			} else if(maze[y+1][x] == 1) {
				System.out.println("Moved down");
				path.push(new Position(y+1, x));
				continue;
			}
			
			//left
			if(maze[y][x-1] == 2) {
				System.out.println("Moved left. You won!");
				return;
			} else if(maze[y][x-1] == 1) {
				System.out.println("Moved left");
				path.push(new Position(y, x-1));
				continue;
			}
			
			//up
			if(maze[y-1][x] == 2) {
				System.out.println("Moved up. You won!");
				return;
			} else if(maze[y-1][x] == 1) {
				System.out.println("Moved up");
				path.push(new Position(y-1, x));
				continue;
			}
			
			//right
			if(maze[y][x+1] == 2) {
				System.out.println("Moved right. You won!");
				return;
			} else if(maze[y][x+1] == 1) {
				System.out.println("Moved right");
				path.push(new Position(y, x+1));
				continue;
			}
			
			path.pop();
			if(path.size() < 0) {
				System.out.println("No path");
			}
		}

	}

}
