package edu.iis.mto.similarity;

import edu.iis.mto.search.SequenceSearcher;

public class Search 
{
	public static SequenceSearcher getSequenceSearcher() {
 		return new SequenceResult();
 	}
}
