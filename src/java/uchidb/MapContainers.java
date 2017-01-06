package uchidb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapContainers<T, S> implements Containers<T, S> {

	private Map<S, T> map;

	@Override

	public Set<T> initSet(T[] tArray) {
		Set<T> resultSet = new HashSet<T>();
		for (Object t : tArray) {
			resultSet.add((T) t);
		}
		return resultSet;
	}

	@Override
	public List<T> initList(T[] tArray) {
		List<T> resultList = new ArrayList<T>();
		for (Object t : tArray) {
			resultList.add((T) t);
		}
		return resultList;
	}

	@Override
	public Map<S, T> initEmptyMap() {
		Map<S, T> resultMap = new HashMap<S, T>();
		return resultMap;
	}

	@Override
	public void storeMap(Map<S, T> mapToStoreInClass) {
		if (mapToStoreInClass.isEmpty())
			map = initEmptyMap();
		for (S key : mapToStoreInClass.keySet()) {
			map.put(key, mapToStoreInClass.get(key));
		}

	}

	@Override
	public boolean addToMap(S key, T value, boolean overwriteExistingKey) {
		if (map.containsKey(key)) {
			if (overwriteExistingKey) {
				map.put(key, value);
				return true;
			} else {
				return false;
			}
		} else
			map.put(key, value);
		return false;
	}

	@Override
	public T getValueFromMap(S key) {
		return map.get(key);
	}

	@Override
	public T getValueFromMap(S key, T defaultValue) {
		if (map.containsKey(key))
			return map.get(key);
		return defaultValue;
	}

}
