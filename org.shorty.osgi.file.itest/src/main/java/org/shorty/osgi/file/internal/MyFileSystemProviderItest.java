package org.shorty.osgi.file.internal;

import java.nio.file.spi.FileSystemProvider;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class MyFileSystemProviderItest
{

	private final BundleContext context = FrameworkUtil.getBundle(MyFileSystemProviderItest.class).getBundleContext();

	@Before
	public void before()
	{
		// TODO add test setup here
	}

	@After
	public void after()
	{
		// TODO add test clear up here
	}

	@Test
	public void testMyFS()
	{
		assertNotNull(context);

		List<FileSystemProvider> installedProviders = FileSystemProvider.installedProviders();
		for (FileSystemProvider fileSystemProvider : installedProviders)
		{
			System.out.println("--> FS: " + fileSystemProvider.getScheme());
		}
	}

}
