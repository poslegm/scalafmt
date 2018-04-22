package org.scalafmt.config

import metaconfig._

case class RedundantBracesSettings(
    methodBodies: Boolean = true,
    includeUnitMethods: Boolean = true,
    maxLines: Int = 100,
    stringInterpolation: Boolean = false,
    // Re-enable generalExpressions once
    // https://github.com/scalameta/scalafmt/issues/1147 is fixed
    generalExpressions: Boolean = false
) {
  val reader: ConfDecoder[RedundantBracesSettings] = generic.deriveDecoder(this)
}

object RedundantBracesSettings {
  implicit val surface: generic.Surface[RedundantBracesSettings] =
    generic.deriveSurface
}
