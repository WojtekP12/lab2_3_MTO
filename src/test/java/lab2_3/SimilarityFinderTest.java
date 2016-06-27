package lab2_3;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.search.SequenceSearcher;
import edu.iis.mto.similarity.Search;
import edu.iis.mto.similarity.SimilarityFinder;

public class SimilarityFinderTest 
{
	private SequenceSearcher searcher;
	private SimilarityFinder finder;
	
	@Before
	public void start()
	{
		searcher = Search.getSequenceSearcher();
		finder = new SimilarityFinder(searcher);
	}
	
	@Test
	public void similarityFinderTest() {
		SimilarityFinder finder = new SimilarityFinder(searcher);
		int[] seq1 = {1,5,6,7,8};
		int[] seq2 = {1,5,6,7,8};
		
		double result = finder.calculateJackardSimilarity(seq1, seq2);
		assertEquals(1, result, 0.0001);
	}
}
