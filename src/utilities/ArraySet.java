package utilities;

import java.util.ArrayList;
import java.util.Set;

public class ArraySet<E> implements Set<E>
{
	protected ArrayList<E> _list;

	public ArraySet()
	{
		_list = new ArrayList<E>();
	}

	public ArraySet(Collection<E> collection)
	{
		this();

		for (E item : collection)
		{
			add(item);
		}
	}
}
