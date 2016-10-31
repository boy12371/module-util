package io.swagger.util.common1.util.newbean;

import java.util.List;

/**
 * 
 * 
 * =============================================================================
 * 
 * 描述：
 * 
 * 作者：
 * 
 * 日期：
 * 
 * =============================================================================
 */
public class Position {
	private String id;
	private String index;
	private List<Position> positions;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public List<Position> getPositions() {
		return positions;
	}

	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}
}
