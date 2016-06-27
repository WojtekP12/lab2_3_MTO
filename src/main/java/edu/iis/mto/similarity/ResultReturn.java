package edu.iis.mto.similarity;

import edu.iis.mto.search.SearchResult;

public class ResultReturn implements SearchResult
{
	private boolean found = false;
	private int position = -1;
	
	public ResultReturn(boolean found, int position)
	{
		this.found = found;
		this.position = position;
	}
	
	public boolean isFound() {
		// TODO Auto-generated method stub
		return this.found;
	}

	public int getPosition() {
		// TODO Auto-generated method stub
		return this.position;
	}
}
