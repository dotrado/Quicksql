/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qihoo.qsql.org.apache.calcite.sql.fun;

import com.qihoo.qsql.org.apache.calcite.sql.SqlCall;
import com.qihoo.qsql.org.apache.calcite.sql.SqlFunction;
import com.qihoo.qsql.org.apache.calcite.sql.SqlFunctionCategory;
import com.qihoo.qsql.org.apache.calcite.sql.SqlKind;
import com.qihoo.qsql.org.apache.calcite.sql.SqlLiteral;
import com.qihoo.qsql.org.apache.calcite.sql.SqlNode;
import com.qihoo.qsql.org.apache.calcite.sql.SqlOperandCountRange;
import com.qihoo.qsql.org.apache.calcite.sql.parser.SqlParserPos;
import com.qihoo.qsql.org.apache.calcite.sql.type.OperandTypes;
import com.qihoo.qsql.org.apache.calcite.sql.type.ReturnTypes;
import com.qihoo.qsql.org.apache.calcite.sql.type.SqlOperandCountRanges;
import com.qihoo.qsql.org.apache.calcite.sql.type.SqlOperandTypeChecker;
import com.qihoo.qsql.org.apache.calcite.sql.type.SqlTypeTransforms;
import com.qihoo.qsql.org.apache.calcite.sql.validate.SqlValidator;

/**
 * The <code>JSON_TYPE</code> function.
 */
public class SqlJsonPrettyFunction extends SqlFunction {

  public SqlJsonPrettyFunction() {
    super("JSON_PRETTY",
        SqlKind.OTHER_FUNCTION,
        ReturnTypes.cascade(ReturnTypes.VARCHAR_2000, SqlTypeTransforms.FORCE_NULLABLE),
        null,
        OperandTypes.ANY,
        SqlFunctionCategory.SYSTEM);
  }

  @Override public SqlOperandCountRange getOperandCountRange() {
    return SqlOperandCountRanges.of(1);
  }

  @Override protected void checkOperandCount(SqlValidator validator,
      SqlOperandTypeChecker argType, SqlCall call) {
    assert call.operandCount() == 1;
  }

  @Override public SqlCall createCall(SqlLiteral functionQualifier,
      SqlParserPos pos, SqlNode... operands) {
    return super.createCall(functionQualifier, pos, operands);
  }
}

// End SqlJsonPrettyFunction.java
