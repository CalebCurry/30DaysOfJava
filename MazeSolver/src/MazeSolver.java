import java.util.ArrayList;
import java.util.LinkedList;

public class MazeSolver {


	//0 = wall
	//1 = path
	//2 = destination
	
	public static void main(String[] args) {

		ArrayList<Maze> mazes = new ArrayList<Maze>();
		
		Maze m = new Maze();
		
		int[][] maze = {
			{1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
			{0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0},
			{0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1},
			{1, 1, 1, 2, 0, 1, 0, 1, 0, 1, 0},
			{0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1}
		};
		m.maze = maze;
		m.start = new Position(4,8);
		m.path = new LinkedList<Position>();
		
		Maze n = new Maze();
		int[][] n_maze = {
			{1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
			{0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0},
			{0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1},
			{1, 1, 1, 2, 0, 1, 0, 1, 0, 1, 0},
			{0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1}
		};
		n.maze = n_maze;
		n.start = new Position(4,8);
		n.path = new LinkedList<Position>();
	
		mazes.add(m);
		mazes.add(n);
		
		int i = 0;
		while(i < mazes.size()) {
			if(solveMaze(mazes.get(i))) {
				System.out.println("You won!");
			} else {
				System.out.println("No path");
			}
			i++;
		}
	}
	
	private static boolean solveMaze(Maze m) {

		Position p = m.start;
		m.path.push(p);
		
		
		while(true) {
			int y = m.path.peek().y;
			int x = m.path.peek().x;
			
			m.maze[y][x] = 0;

			//down
			if(isValid(y+1, x, m)) {
				if(m.maze[y+1][x] == 2) {
					System.out.println("Moved down");
					return true;
				} else if(m.maze[y+1][x] == 1) {
					System.out.println("Moved down");
					m.path.push(new Position(y+1, x));
					continue;
				}
			}

			//left
			if(isValid(y, x-1, m)) {
				if(m.maze[y][x-1] == 2) {
					System.out.println("Moved left");
					return true;
				} else if(m.maze[y][x-1] == 1) {
					System.out.println("Moved left");
					m.path.push(new Position(y, x-1));
					continue;
				}
			}
			
			//up
			if(isValid(y-1, x, m)) {
				if(m.maze[y-1][x] == 2) {
					System.out.println("Moved up");
					return true;
				} else if(m.maze[y-1][x] == 1) {
					System.out.println("Moved up");
					m.path.push(new Position(y-1, x));
					continue;
				}
			}

			//right
			if(isValid(y, x+1, m)) {
				if(m.maze[y][x+1] == 2) {
					System.out.println("Moved right");
					return true;
				} else if(m.maze[y][x+1] == 1) {
					System.out.println("Moved right");
					m.path.push(new Position(y, x+1));
					continue;
				}
			}
			
			m.path.pop();
			System.out.println("Moved back");
			if(m.path.size() <= 0) {
				return false;
			}
		}
	}

	public static boolean isValid(int y, int x, Maze m) {
		if(y < 0 || 
			y >= m.maze.length ||
			x < 0 ||
			x >= m.maze[y].length
		 ) {
			return false;
		}
		return true;
	}

}
