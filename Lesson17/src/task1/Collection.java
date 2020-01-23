package task1;

public class Collection {
	private static Number[] array;
	
	Collection(Number[] array) {
		Collection.array = array;
	}
	
	public class ForwardIterator implements Iterator {
		private int i = 0;
		
		@Override
		public boolean hasNext() {
			return i <= array.length-1;
		}

		@Override
		public Number next() {
			Number val = array[i];
			i++;
			if ((int)val % 2 == 0) return val;
			else return val = 0;
		}
	}

	public ForwardIterator createForwardIterator() {
		return new ForwardIterator();
	}
	

	public class BackwardIterator implements Iterator {
		private int i = array.length - 1;

		@Override
		public boolean hasNext() {
			return i >= 0;
		}

		@Override
		public Number next() {
			Number val = array[i];
			i-=2;
			return val;
		}
	}

	public BackwardIterator createBackwardIterator() {
		return new BackwardIterator();
	}
	
	public Iterator createAnonymousIterator() {
		return new Iterator() {
			private int i = array.length - 1;

			@Override
			public boolean hasNext() {
				return i >= 0;
			}

			@Override
			public Number next() {
				Number val = array[i];
				i-=3;
				if ((int)val % 2 != 0) return val;
				else return val = 0;
			}
		};
	}
	
	public Iterator createLocalIterator() {
		class LocalIterator implements Iterator {
			private int i = 0;

			@Override
			public boolean hasNext() {
				return i <= array.length-1;
			}

			@Override
			public Number next() {
				Number val = array[i];
				i+=5;
				if ((int)val % 2 == 0) val = (int)val - 100;	
				return val;
			}
		}
		return new LocalIterator();
	}
	
	static class StaticIterator implements Iterator {
		private int i = 0;

		@Override
		public boolean hasNext() {
			return i <= array.length-1;
		}

		@Override
		public Number next() {
			Number val = array[i];
			i+=2;
			if ((int)val % 2 == 0) val = (int)val + 1;
			return val;
		}
	}
	
	StaticIterator createStaticIterator() {
		return new StaticIterator();
	}
}
