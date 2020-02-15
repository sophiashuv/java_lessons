import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {
	private Set<Seance> seances = new TreeSet<>();
	
	public Schedule() {
		this.seances = new TreeSet<>();
	}
	
	public Schedule(Seance firstSeance) {
		seances.add(firstSeance);	
	}
	
	public Set<Seance> getSeances() {
		return seances;
	}

	public void setSeances(Set<Seance> seances) {
		this.seances = seances;
	}

	public void addSeance (Seance newSeance) {	
		seances.add(newSeance);
	}
	
	public void removeSeance (Seance removeSeance) {
		if(!seances.isEmpty()) {
			Iterator<Seance> itr = seances.iterator();            
			while(itr.hasNext()){
				Seance seance = itr.next();
			    if(seance.equals(removeSeance)) itr.remove();
			}
		}
	}
	
	public void removeSeances (Seance removeSeance) {
		if(!seances.isEmpty()) {
			Iterator<Seance> itr = seances.iterator();            
			while(itr.hasNext()){
				Seance seance = itr.next();
			    if(seance.equal(removeSeance)) itr.remove();
			}
		}
	}

	@Override
	public String toString() {
		return seances.stream().map(e -> e.toString()).reduce("\n", String::concat);
	}
}
