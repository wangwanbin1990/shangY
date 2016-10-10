package com.gcmobile.security;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

public interface ShiroConstants {

	// 角色
	public static final String ROLE_BORROW = "borrow"; // 借款者
	public static final String ROLE_INVEST = "invest"; // 投资者

	// 权限
	public static final String PERMISSION_BORROW = "borrow";
	public static final String PERMISSION_INVEST = "invest";

	// 角色: 0 借款用户, 1 理财用户
	public static final String[] roles = { ROLE_BORROW, ROLE_INVEST };

	// 权限
	public static final Map<String, List<String>> permissions = ImmutableMap.of(ROLE_BORROW,
			Arrays.asList(new String[] { PERMISSION_BORROW }), ROLE_INVEST,
			Arrays.asList(new String[] { PERMISSION_INVEST }));
}
